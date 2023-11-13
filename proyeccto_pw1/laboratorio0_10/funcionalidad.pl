#!"c:\xampp\perl\bin\perl.exe"
use strict;
use warnings;
use CGI;
use Text::CSV;
my $archivo_csv = 'lista.csv';
my $cgi = CGI->new;
my $nombre_universidad = $cgi->param('nombre_universidad');
my $campo_busqueda = $cgi->param('campo_busqueda');
my $resultados = consultar_universidades($nombre_universidad, $campo_busqueda);
mostrar_respuesta_html($resultados);

sub consultar_universidades {
    my ($nombre_universidad, $campo_busqueda) = @_;
    my %resultados_unicos;
    my $csv = Text::CSV->new({ binary => 1 });

    open my $fh, '<', $archivo_csv or die "No se pudo abrir el archivo CSV: $!";

    my $encabezado = $csv->getline($fh);

    my $indice_campo = 0;
    foreach my $i (0..$#{$encabezado}) {
        if ($encabezado->[$i] eq $campo_busqueda) {
            $indice_campo = $i;
            last;
        }
    }

    while (my $fila = $csv->getline($fh)) {
        if (index(lc($fila->[$indice_campo]), lc($nombre_universidad)) != -1) {
            $resultados_unicos{ join(', ', @$fila) } = 1;
        }}
    close $fh;
    my @resultados = keys %resultados_unicos;
    return \@resultados;
}

sub mostrar_respuesta_html {
    my ($resultados) = @_;
    print $cgi->header(-type => 'text/html', -charset => 'utf-8');
    print <<"HTML";
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultados de la Consulta</title>
    <link rel="stylesheet" href="sstyles.css">
</head>
<body>
    <hear>
    <h1>Resultados de la Consulta</h1>
HTML

    if (@$resultados) {
        print "<ul>";
        foreach my $resultado (@$resultados) {
            print "<li>$resultado</li>";
        }
        print "</ul>";
    } else {
        print "<p>No se encontraron resultados.</p>";
    }

    print <<"HTML";
    </hear>
</body>
</html>
HTML
}
