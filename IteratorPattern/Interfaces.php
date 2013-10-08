<?php
interface Container
{
	public function createIterator();
}

interface IIterator
{
	public function hasNext();
	public function next();
}