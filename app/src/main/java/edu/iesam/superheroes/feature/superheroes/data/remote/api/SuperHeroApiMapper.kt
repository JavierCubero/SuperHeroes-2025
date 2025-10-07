package edu.iesam.superheroes.feature.superheroes.data.remote.api

import edu.iesam.superheroes.feature.superheroes.domain.SuperHero


fun SuperHeroApiModel.toModel() : SuperHero {
    return SuperHero(this.id, this.name, this.slug, this.images.md)

}