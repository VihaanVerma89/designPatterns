<?php

require_once("ErrorObject.php");
require_once("LogToConsole.php");
require_once("LogToCSV.php");
require_once("LogToCSVAdapter.php");

$error = new Error("404: not found");

$log = new LogToConsole($error);
$log->write();

$error = new LogToCSVAdapter("404: not found");
$log = new LogToCSV($error);
$log->write();