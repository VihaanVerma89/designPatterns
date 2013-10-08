<?php

require_once("Interfaces.php");

class Book
{
	private $_Author;	
	private $_Title;
	
	public function __construct($author, $title)
	{
		$this->_Author = $author;	
		$this->_Title = $title;
	}
	
	public function getAuthor()
	{
		return $this->_Author;
	}

	public function getTitle()
	{
		return $this->_Title;
	}
}

class BooksCollection implements Container
{
	private $_books;
	
	public function addBook($book)
	{
		if($book instanceof Book)
		{
			$this->_books[] = $book;
		}
	}
	
	public function getBooks()
	{
		return $this->_books;
	}
	
	public function getBook($location)
	{
		return $this->_books[$location];		
	}

	public function createIterator()
	{
		return new BookIterator($this);	
	}	
	
	public function getCount()
	{
		return count($this->_books);
	}
}

class BookIterator implements IIterator
{
	private $_booksCollection;
	private $_position=0;
	
	public function __construct($booksCollection)
	{
		if($booksCollection instanceof BooksCollection)
		{
			$this->_booksCollection = $booksCollection;
		}
	}
	
	public function hasNext()
	{
		if($this->_position < $this->_booksCollection->getCount())
		{
			return true;	
		}
		else
		{
			return false;
		}
	}	
	
	public function next()
	{
		if($this->hasNext())		
		{
			return $this->_booksCollection->getBook($this->_position++);
		}
		else
		{
			return null;
		}
	}
}
