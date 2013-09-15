<?php

class LogToCSVAdapter extends Error
{
	private $_errorNumber;
	private $_errorText;

	public function __construct($error)
	{
		parent::__construct($error);
		
		$parts = explode(':', $error);
		$this->_errorNumber = $parts[0];
		$this->_errorText = $parts[1];
	}
	
	public function getErrorNumber()
	{
		return $this->_errorNumber;	
	}

	public function getErrorText()
	{
		return $this->_errorText;	
	}
}