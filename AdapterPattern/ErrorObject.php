<?php

class Error
{
	private $_error;
	
	public function __construct($error)
	{
		$this->_error = $error;
	}

	public function getError()
	{
		if(!empty($this->_error))		
		{
			return $this->_error;
		}
	}
}