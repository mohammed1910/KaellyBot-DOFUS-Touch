# KaellyBOT DOFUS Touch[![Build Status](https://travis-ci.org/Kaysoro/KaellyBot.svg?branch=master)](https://travis-ci.org/Kaysoro/KaellyBot) [![Dependency Status](https://www.versioneye.com/user/projects/587eb975452b8300313609ee/badge.svg?style=flat)](https://www.versioneye.com/user/projects/587eb975452b8300313609ee) [![Coverage Status](https://coveralls.io/repos/github/Kaysoro/KaellyBot/badge.svg?branch=master)](https://coveralls.io/github/Kaysoro/KaellyBot?branch=master)
KaellyBOT DOFUS Touch est destinée à fournir des commandes utiles à la communauté de DOFUS Touch ! L'intégralité de son code est libre d'accès. Si vous avez des questions, des suggestions ou que vous souhaitez juste passer un coucou, rejoignez le serveur discord du support : [![Support Server Invite](https://img.shields.io/badge/Join-KaellyBOT%20Support-7289DA.svg?style=flat)](https://discord.gg/CyJCFDk)

## Ajoutez KaellyBOT DOFUS Touch à votre serveur : [![Official Kaelly Invite](https://img.shields.io/badge/Add-KaellyBOT-0199FE.svg?style=flat)](https://discordapp.com/oauth2/authorize?&client_id=323396178341265408&scope=bot)

## Commandes

### Help

 Cette commande est destiné à expliciter les commandes de Kaelly avec des exemples d'utilisation.   
 `!help` explique de manière succinte chaque commande.  
 `!help command` explique de façon détaillée la commande spécifiée.  

### Almanax

Donne des informations relatives à l'Almanax.  
`!almanax` : Donne le bonus et l'offrande du jour actuel.
`!almanax jj/mm/aaaa` : Donne le bonus et l'offrande du jour spécifié.

### About

Donne des informations relatives à Kaelly.  
`!about` : Donne des informations sur KaellyBOT et un moyen d'obtenir de l'aide.

### Item

Renvoie les statistiques d'un item du jeu DOFUS Touch. 
`!item item` : Renvoie les statistiques de l'item spécifié : son nom peut être approximatif s'il est suffisemment précis. A noter que les items inférieurs au niveau 50 sont exclus.  

### Job

Gère un annuaire d'artisans.
`!job` : Renvoie la liste des métiers du jeu DOFUS Touch.  
`!job métier` : Renvoie l'annuaire des artisans pour ce métier.  
`!job métier niveau` : Vous ajoute à l'annuaire du métier correspondant. Si vous indiquez 0, vous êtes supprimé de l'annuaire pour ce métier.  
`!job -all niveau` : Vous ajoute à l'annuaire pour tous les métiers correspondants. Si vous indiquez 0, vous êtes supprimé de chaque annuaire.  

### Map

Tire au hasard une carte du Goultarminator.
`!map` : Tire au hasard une carte du Goultarminator ou bien parmi celles spécifiées en paramètre.  
`!map map1 map2 ...` : Tire une carte parmi celles spécifiées en paramètre. Nombres romains ou numériques uniquement.  

### Pos (Dimensions)

Gère les positions de portails de dimension.
`!pos dimension` : Donne la position du portail de la dimension désirée.  
`!pos dimension [POS, POS]` : Met à jour la position du portail de la dimension spécifiée.  
`!pos dimension [POS, POS] nombre d'utilisations` : Met à jour la position et le nombre d'utilisation de la dimension spécifiée.  
`!pos -reset dimension` : Supprime les informations de la dimension spécifiée.  

### Prefixe

Change le préfixe utilisé pour invoquer une commande. Niveau modérateur minimum requis. 
`!prefixe prefixe` : Change le préfixe par celui passé en paramètre. 3 maximum.  

### Random

Commande tirant des valeurs aléatoires.
`!rdm` : Tire une valeur entre Vrai et Faux.  
`!rdm nombre` : Tire une valeur entre 0 et nombre.  
`!rdm valeur1 valeur2 ...` : Tire une valeur parmi celles spécifiées en paramètre.  

### Right

Gère les droits d'administration de Kaelly. 
`!right` : Donne le niveau d'administration de l'auteur de la requête.  
`!right @pseudo` : Donne le niveau d'administration de l'utilisateur ou d'un groupe spécifié.  
`!right @pseudo niveau` : Change le niveau d'administration d'un utilisateur ou d'un groupe spécifié.  

### RSS

Autorise ou non Kaelly à poster du contenu RSS dans un salon. 
`!rss true` : Poste les news à partir du flux RSS de Dofus-touch.com. Fonctionne aussi avec `on` et `0`.  
`!rss false` : Ne poste plus les flux RSS dans le salon. Fonctionne aussi avec `off` et `1`.  

### Rule34 (NSFW)

Poste des images sexuellement explicites.
`!rule34 tag1 tag2 ...` : Poste du contenu sexuellement explicite (NSFW) avec les tag précisés.  

### Sound

Joue des sons dans un salon vocal.
`!sound` : Joue un son au hasard, parmi une liste prédéfinie.  
`!sound sound` : Joue le son spécifié.  

### Twitter

Autorise ou non Kaelly à poster des tweets dans un salon.
`!twitter true` : Poste les tweets de DofusTouch. Fonctionne aussi avec `on` et `0`.  
`!twitter false` : Ne poste plus les tweets dans le salon. Fonctionne aussi avec `off` et `1`.  

### Whois

Affiche la page personelle d'un joueur. 
`!whois *pseudo*` : Donne la page personnelle associée au pseudo. Celui-ci doit être exact.  
`!whois *pseudo serveur*` : Est à utiliser lorsque le pseudo ne suffit pas pour déterminer la fiche d'un personnage. 

# Participer au projet

## Modifier KaellyBOT

Tout le monde peut aider pour le développement de KaellyBOT ! Il suffit de créer un pull request qui sera accepté si il ne créé aucun problème avec la branche principale : https://github.com/Kaysoro/KaellyBot/pulls.

## Créer votre Bot

### Obtenir un token Discord

1. Connectez vous sur le [site developers discord](https://discordapp.com/developers/applications/me).
2. Dans Application > MyApp : Cliquez sur New App.
3. Renseignez le nom du Bot, une brève description et une icône.
4. Une fois créé, Cliquez sur "Create a bot user".
5. Cochez la case "Public bot" si vous souhaitez qu'il soit accessible par n'importe qui.
6. Récupérez le client ID et le token, ils vous serviront à ajouter votre bot sur un serveur et à le mettre en route.

Ne diffusez pas votre token, il permettrai à n'importe qui de modifier votre bot.

### Obtenir un lien d'invitation

Vous avez créé votre bot sur le site de Discord et vous souhaitez l'inviter sur un serveur.
Prennez le client ID de votre bot et placez le à la place de CLIENT_ID dans l'url suivante :
https://discordapp.com/oauth2/authorize?&client_id=CLIENT_ID&scope=bot

### Connecter le bot à Discord

Maintenant que vous avez déclaré votre application sur la plateforme Discord, il suffit d'ajouter le token précèdemment copié dans le fichier [config.properties](https://github.com/Ehstrali/KaellyBot-DOFUS-Touch/blob/master/config.properties), de telle sorte que : discord.token=TOKEN.

Avant de continuer il faut ajouter ce fichier pour que votre bot fonctionne : [bdd.sqlite](https://mega.nz/#!l4hwjRSJ!GMuk5P9qt3EZpuDD_YCYcNUPZd8CRx9LvuHQm_AA4PQ). Mettez le dans votre dossier Kaelly.

#### Créer le .jar pour démarrer le bot :

- `cd VotreProjet`
- `mvn clean compile`
- `mvn assembly:single`

#### Démarrer le .jar :

- En double cliquant dessus (Ne fonctionne pas forcément).
- En l'exécutant depuis la console : `java -jar jarfile` (Permet aussi d'avoir les logs du bot).

#### Heberger le .jar :

Vous pouvez soit héberger le bot sur un serveur vous donnant accès à une console. Ou laisser un ordinateur allumé pour héberger le bot (Un Raspberry pi par exemple).

## Licence

Ce projet est sous licence GPL(v3).
