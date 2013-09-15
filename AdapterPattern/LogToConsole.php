<?php

class LogToConsole
{
	private $_error; 
	public function __construct($error)
	{
		$this->_error = $error;	
	}
	
	public function write()
	{
		if(!empty($this->_error))
		{
			fwrite(STDERR, $this->_error->getError());
		}
	}
}