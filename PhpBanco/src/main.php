<?php
require __DIR__ . "/../vendor/autoload.php";
 

use App\models\UsuarioSistema;
use App\util\globalvars;
//$u = new UsuarioSistema;
//$u ->nome = "Joel";
//var_dump($u->nome);

echo globalvars ::$nomedoApp . '<br>';
echo UsuarioSistema ::$variavelestatica;
