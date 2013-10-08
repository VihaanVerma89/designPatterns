<?php
require("Iterator.php");

class Tester
{
	static function main()
	{
		$book1 = new Book("Author1", "Novel1");
		$book2 = new Book("Author2", "Novel2");
		$book3 = new Book("Author3", "Novel3");
		$book4 = new Book("Author4", "Novel4");

		$booksCollection = new BooksCollection();

		$booksCollection->addBook($book1);
		$booksCollection->addBook($book2);
		$booksCollection->addBook($book3);
		$booksCollection->addBook($book4);

		$bookIterator = $booksCollection->createIterator();


		while($bookIterator->hasNext())
		{
			$book = $bookIterator->next();
			echo "Author: " . $book->getAuthor() . "Title: " . $book->getTitle();
		}

	}
}

Tester::main();