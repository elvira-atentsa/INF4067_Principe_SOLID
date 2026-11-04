# Module OCP (Open-Closed Principle)

## 1. Contexte et Origine du Projet
Ce projet s'inscrit dans le cadre du cours de **Principes SOLID** (Module `INF4067_Principe_SOLID`).

À l'origine, une mauvaise conception (comme l'utilisation de structures conditionnelles `instanceof` dans une classe de calcul comme `AreaCalculator`) viole l'OCP. Chaque ajout d'une nouvelle forme géométrique oblige à modifier le code existant, ce qui rend l'application rigide, fragile et sujette à de nouveaux bugs.

---

## 2. Pourquoi ce code a-t-il été écrit ? (Objectif de l'OCP)
Le **Principe Ouvert/Fermé (Open-Closed Principle - OCP)** stipule qu'une entité logicielle (classe, module, etc.) doit être **ouverte à l'extension** mais **fermée à la modification**. 

L'extensibilité doit se faire uniquement par l'ajout de nouveau code, en s'appuyant sur l'**abstraction** et le **polymorphisme**[cite: 9]. Pour y parvenir lors de notre *refactoring*, nous avons mis en place :
1. **`Shape` (Interface) :** Définit l'abstraction commune pour le calcul de l'aire (`calculateArea`).
2. **`Rectangle` & `Circle` (Implémentations) :** Étendent le comportement en implémentant l'interface `Shape` de manière autonome sans modifier le reste du code.
3. **`AreaCalculator2` (Classe de calcul) :** Utilise le polymorphisme pour calculer l'aire de n'importe quelle forme géométrique sans se soucier de son type exact.

---

## 3. Structure de l'Arborescence
Le projet est organisé de la manière suivante sous la racine `INF4067_Principe_SOLID` :

```text
INF4067_Principe_SOLID/
│
└── OCP/
    ├── Shape.java
    ├── Rectangle.java
    ├── Circle.java
    ├── AreaCalculator2.java
    ├── Main.java
    └── README.md
```   
## 4. Comment tester le code ?

Pour tester le bon fonctionnement de l'architecture sans utiliser de gestionnaire de paquets complexe, un fichier de test exécutable (`Main.java`) est placé directement dans le même dossier.

### Étapes d'exécution en ligne de commande :

1. **Ouvrez votre terminal** et positionnez-vous dans le dossier contenant les fichiers sources :
   ```bash
   cd chemin/vers/INF4067_Principe_SOLID/OCP
   ```
2. Compilez l'ensemble des fichiers Java du dossier pour générer les fichiers .class :
   ```bash
   javac *.java
   ```
3. Exécutez le programme de test via la classe principale Main
   ```bash
   java Main
   ```