package io.altar.jseproject.business;

import io.altar.jseproject.models.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public interface ShelfBusinessInt extends EntityBusinessInt<Shelf> {
	ShelfRepository ShelfRep = ShelfRepository.getInstance();
}
