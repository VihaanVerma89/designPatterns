<?php

class LogToCSV
{
	private $_error;

	public function __construct($error)
	{
		$this->_error = $error;		
	}
	
	public function write()
	{
		$line = $this->_error->getErrorNumber();
		$line .= ", ";
		$line .= $this->_error->getErrorText();

		file_put_contents('log.csv', $line);
	}
}