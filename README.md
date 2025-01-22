# Pacem - README Technique
Anc3 Etudiants 2016-2017 /
## Table des Matières
1. [Présentation du Projet](#presentation-du-projet)
2. [Prérequis](#prerequis)
3. [Installation](#installation)
4. [Structure du Projet](#structure-du-projet)
5. [Fonctionnalités par Itération](#fonctionnalites-par-iteration)
6. [Dépendances](#dependances)
7. [Instructions pour le Développement](#instructions-pour-le-developpement)
8. [Tests](#tests)
9. [Déploiement](#deploiement)

---

## Objectifs

- Appliquer les principes SOLID et les patterns de conception pour une architecture maintenable.

- Implémenter une architecture MVC pour séparer les responsabilités.

- Illustrer des concepts tels que l'Observer Observable, le Singleton, la Façade, et bien d'autres.
  

## Présentation du Projet
Pacem est un jeu immersif inspiré de Pac-Man qui combine aventure et stratégie. Ce projet est divisé en plusieurs itérations, chacune apportant des fonctionnalités et des améliorations basées sur les principes de conception logicielle. Le jeu inclut des personnages mobiles, des règles dynamiques et une architecture modulaire.

Langage principal : Java
Frameworks utilisés : JavaFX
Plateformes prises en charge : Windows, macOS, Linux

## Prérequis
1. Un système d'exploitation compatible.
2. Java Development Kit (JDK) version 8 ou supérieure.
3. Un IDE tel que IntelliJ IDEA ou Eclipse.
4. Un accès à un gestionnaire de version comme Git.

## Fonctionnalités par Itération
### Itération 1 : Application Console Basique
- Pac-Man peut se déplacer dans un labyrinthe statique.
- Les fantômes sont immobiles.
- Les interactions incluent la collecte de pac-gommes, de fruits (Super Pac-Man), et la perte de vies.
- Architecture MVC avec Observer/Observable.

### Itération 2 : Portage vers JavaFX
- Interface graphique avec un canevas pour afficher le labyrinthe et les personnages.
- Gestion des entrées utilisateur via les touches directionnelles.
- Support pour les deux versions (console et JavaFX) dans un seul projet.

### Itération 3 : Déplacement des Fantômes
- Les fantômes se déplacent aléatoirement en suivant des règles simples.
- Introduction de la classe Timeline pour gérer les mouvements autonomes.
- Pac-Man reste Super Pac-Man pour une durée limitée.

### Itération 4 : Pattern Composite pour les Fantômes
- Les fantômes peuvent se regrouper, formant des entités plus puissantes.
- Les groupes se séparent après 5 secondes.
- Gestion visuelle et des interactions complexes avec des groupes de fantômes.

### Itération 5 : Pattern Memento pour Sauvegarder l'État
- Pac-Man peut sauvegarder l'état du jeu en mangeant un champignon.
- Restauration automatique de l'état sauvegardé en cas de perte d'une vie.
- La partie est gagnée lorsque toutes les pac-gommes sont collectées.

## Dépendances
- JavaFX : Framework pour l'interface utilisateur.
- Maven : Gestionnaire de dépendances et de construction.
- JUnit : Framework pour les tests unitaires.

## Instructions pour le Développement
1. **Ajout de nouvelles fonctionnalités**
   - Créez une nouvelle branche basée sur `main` :
     ```bash
     git checkout -b feature/nom-fonctionnalite
     ```
   - Implémentez vos modifications et ajoutez des tests appropriés.

2. **Standards de codage**
   - Respectez les conventions Java (exemple : CamelCase pour les classes).

3. **Commit et Pull Request**
   - Rédigez des messages de commit explicites.
   - Soumettez une pull request pour la révision.

## Tests
Pour exécuter les tests :
```bash
mvn test
```

Les tests incluent :
- Vérification des déplacements de Pac-Man et des fantômes.
- Validation des interactions avec les pac-gommes, fruits et champignons.



