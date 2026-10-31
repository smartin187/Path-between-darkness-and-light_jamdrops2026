# To Do

La liste des tâches a faires pour le projet.

Lors qu'une tâche est assignée, le nom du contributeur doit être mise en début de ligne.

## Tâches

- Dans les paramètres de l'espace de travaille (MCreator):
    - [smartin187] Mettre l'id du mod en rapport avec le nom (paramètres de l'espace de travaille) -> néssécite un remaniment de l'espace de travaille, il ne faut pas de branche en cours
    - [Drizzt478] Pour l'url du mod, pour le Modrith, vérifier qu'il n'y a plus de 404 lors du rendu finale.
- Complété le `README.md` lorsque des fonctionalités sont ajoutés au mod:
    - Mettre la description du mod
    - Mettre quelque images (screenshots)
    - Vérifier l'ortographe
- Une jauge de lumière/obscurité -> Faire d'autre action qui augement / diminue la jauge ?
- Bottes d'ombre / lumière
- _A faire si on a le temps_ Dimension en deux parties, en bas les ténèbre et en haut les nuages / paradis. Avec des mob pour chaque partie (zombie des ténèbre / enges) + boss pour chaque partie. Portail ? + Une dimension où l'on peut accéder si un a le niveau max lumière ou obscurité.
- Epée: Epée d'obscurité: d'autre effet ?
- Pour les mob: Corriger problème avec les annimation des jambes : les jambes des mob sortent de leur corps lors ce qu'il marchent.
- Prêtre de lumière: Mettre un items qu'il dropera ? Que doit dropper le prêtre / gardien de lumière ?
- Optimisation possible : pour les procédure pour bloquer le joueur d'obtenir les oeuf de lumière / obscurité sans niveau max, il y a deux `si` imbriqué, possible de mettre un `and` pour plus de rapidité ?
- Faire netoyage sur les branches Git
- Ajouter un équivalent au prêtre de lumière pour l'obscurité ?
- Pour la structure du temple de lumière :
    - Un slim apparait souvent en dessous  -> surement qu'il slime a était embarqué dans la structure (si la structure a était faire en monde plat). Soit le slime arrive a spawn, donc il est dessous la structure, soit il spawn dans un bloc
    - des logs `[worldgen/ERROR] [minecraft/BlockAttachedEntity]: Block-attached entity at invalid position: BlockPos{x=-28, y=-34, z=7}` _peut être lié au slime qui apparait dans un bloc_
- Vérifier que les mob d'ombre et de lumière se battent bien
