import json

mats = [("weedwood", {"item": "thebetweenlands:weedwood_planks"}),
        ("valonite", {"item": "thebetweenlands:items_misc",
                      "data": 19}),
        ("slimybone", {"item": "thebetweenlands:items_misc",
                       "data": 14}),
        ("octine", {"item": "thebetweenlands:octine_ingot"})]

def gen_katana_recipe_for_mat(mat_name, mod_name, ingot_entry):
    gen_dict = {
        "type": "minecraft:crafting_shaped",
        "pattern": [
                    "  i",
                    " i ",
                    "h  "
                    ],
        "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                    }
            },
        "result": {
            "item": mod_name + ":katana_" + mat_name
        },
    }
    with open('katana_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_greatsword_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                " i ",
                "iii",
                "ihi"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":greatsword_" + mat_name
            },
        }
    with open('greatsword_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_longsword_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                " i ",
                " i ",
                "ihi"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":longsword_" + mat_name
            },
        }
    with open('longsword_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_saber_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                " i",
                " i",
                "ih"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":saber_" + mat_name
            },
        }
    with open('saber_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_rapier_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "  i",
                "ii ",
                "hi "
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":rapier_" + mat_name
            },
        }
    with open('rapier_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)  

def gen_spear_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "i",
                "p"
            ],
            "key": {
                "i": ingot_entry,
                "p": {
                    "item": "spartanweaponry:material",
                    "data": 1
                }
            },
            "result": {
                "item": mod_name + ":spear_" + mat_name
            },
        }
    with open('spear_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile) 

def gen_dagger_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "i",
                "h"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":dagger_" + mat_name
            },
        }
    with open('dagger_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_pike_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "i",
                "p",
                "p"
            ],
            "key": {
                "i": ingot_entry,
                "p": {
                    "item": "spartanweaponry:material",
                    "data": 1
                }
            },
            "result": {
                "item": mod_name + ":pike_" + mat_name
            },
        }
    with open('pike_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile) 

def gen_lance_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "i",
                "p",
                "h"
            ],
            "key": {
                "i": ingot_entry,
                "p": {
                    "item": "spartanweaponry:material",
                    "data": 1
                },
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":lance_" + mat_name
            },
        }
    with open('lance_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile) 

def gen_halberd_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                " i",
                "ip",
                "i "
            ],
            "key": {
                "i": ingot_entry,
                "p": {
                    "item": "spartanweaponry:material",
                    "data": 1
                },
            },
            "result": {
                "item": mod_name + ":halberd_" + mat_name
            },
        }
    with open('halberd_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile) 

def gen_warhammer_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "ii",
                " h"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":warhammer_" + mat_name
            },
        }
    with open('warhammer_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_throwing_axe_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "hi",
                " i"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":throwing_axe_" + mat_name
            },
        }
    with open('throwing_axe_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_hammer_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "iii",
                "iii",
                " h "
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":hammer_" + mat_name
            },
        }
    with open('hammer_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_throwing_knife_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "hi"
            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                }
            },
            "result": {
                "item": mod_name + ":throwing_knife_" + mat_name
            },
        }
    with open('throwing_knife_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_longbow_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
                "pattern": [
                            "hwi",
                            "w s",
                            "iss"
                        ],
                "key": {
                    "i": ingot_entry,
                    "h": {
                        "item": "spartanweaponry:material",
                        "data": 0
                    },
                    "s": {
                        "type": "forge:ore_dict",
                        "ore": "string"
                    },
                    "w": {
                        "item": "thebetweenlands:items_misc",
                        "data": 4
                    }
                },
            "result": {
                "item": mod_name + ":longbow_" + mat_name
            },
        }
    with open('longbow_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_crossbow_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
                 "pattern": [
                                "bsi",
                                "sw ",
                                "i h"
                            ],
            "key": {
                "i": ingot_entry,
                "h": {
                    "item": "spartanweaponry:material",
                    "data": 0
                },
                "b": {
                    "item": "thebetweenlands:weedwood_bow"
                },
                "s": {
                    "type": "forge:ore_dict",
                    "ore": "string"
                },
                "w": {
                    "item": "thebetweenlands:weedwood_planks"
                }
            },
            "result": {
                "item": mod_name + ":crossbow_" + mat_name
            },
        }
    with open('crossbow_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile)

def gen_javelin_recipe(mat_name, mod_name, ingot_entry):
    gen_dict = {
            "type": "minecraft:crafting_shaped",
            "pattern": [
                "pi"
            ],
            "key": {
                "i": ingot_entry,
                "p": {
                    "item": "spartanweaponry:material",
                    "data": 1
                },
            },
            "result": {
                "item": mod_name + ":javelin_" + mat_name
            },
        }
    with open('javelin_' + mat_name + '.json', 'w') as outfile:
        json.dump(gen_dict, outfile) 

MOD_NAME = "spartanlands"

for each, ingot_dict in mats:
    gen_katana_recipe_for_mat(each, MOD_NAME, ingot_dict)
    gen_greatsword_recipe(each, MOD_NAME, ingot_dict)
    gen_longsword_recipe(each, MOD_NAME, ingot_dict)
    gen_saber_recipe(each, MOD_NAME, ingot_dict)
    gen_rapier_recipe(each, MOD_NAME, ingot_dict)
    gen_spear_recipe(each, MOD_NAME, ingot_dict)
    gen_dagger_recipe(each, MOD_NAME, ingot_dict)
    gen_pike_recipe(each, MOD_NAME, ingot_dict)
    gen_lance_recipe(each, MOD_NAME, ingot_dict)
    gen_halberd_recipe(each, MOD_NAME, ingot_dict)
    gen_warhammer_recipe(each, MOD_NAME, ingot_dict)
    gen_throwing_axe_recipe(each, MOD_NAME, ingot_dict)
    gen_hammer_recipe(each, MOD_NAME, ingot_dict)
    gen_throwing_knife_recipe(each, MOD_NAME, ingot_dict)
    gen_longbow_recipe(each, MOD_NAME, ingot_dict)
    gen_crossbow_recipe(each, MOD_NAME, ingot_dict)
    gen_javelin_recipe(each, MOD_NAME, ingot_dict)
