# -*- coding: utf-8 -*-
"""
Created on Tue Oct 13 11:19:39 2020

@author: VoqmX
"""

import requests

x = requests.get("http://localhost:8989/test")
print(x.text)

while(True):
    print("\n 1. Afficher tous les produits\n 2. Rechercher un produit par ID\n 3. Ajouter un produit\n q. Quitter\n")
    
    choix = input("Que voulez vous faire ? ")
    
    if choix=="1":
        x = requests.get("http://localhost:8989/products")
        print(x.text)
    elif choix=="2":
        code = input("Code produit ? ")
        x = requests.get("http://localhost:8989/findid?code=" + str(code))
        print(x.text)
    elif choix=="3":
        code = input("Code produit ? ")
        designation = input("\nDésignation du produit ? ")
        prix = input("\nPrix du produit ? ")
        x = requests.get("http://localhost:8989/save?code="+str(code)+"&designation=%22"+str(designation)+"%22&prix="+str(prix))
        print(x.text)
    elif choix=="q":
        break
    else:
        print("Entrez un choix valide ")