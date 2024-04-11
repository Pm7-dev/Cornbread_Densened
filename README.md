# Cornbread Densened
Cornbread Densened is a spigot plugin designed to make Minecraft more challenging. It is not made to be fun, and you will probably rage-quit relatively quickly upon playing. It is the second version of the original Cornbread plugin, which was a mess of code that I made six months ago and never released.

It is called Cornbread because I wanted it to be called Cornbread.
# How to Set Up
This tutorial assumes you already have a Spigot server set up. If you do not already know how to set up a Spigot server, many tutorials can be found on YouTube. This plugin will not work on vanilla, fo
1. Head over to the [releases](https://github.com/Pm7-dev/Cornbread-Densened/releases/) page and download the latest (probably only) version of the plugin. 
2. Shut down your server if it is running
3. Add the plugin to your plugins folder
4. Make sure the `level-name` is set to `world` in the `server.properties` file
5. Delete the current world folder, along with the nether and end world folders
6. add the following text to the end of your `bukkit.yml` file
```
worlds:
  world:
    generator: CornbreadDensened
  ```
# Feature List
For maximum annoyance value, I suggest playing through the game completely blind. However, if you want to know exactly what you're getting yourself into, click the "Show Feature List" button to see what exactly the plugin does
<details>
  <summary>Show Feature List</summary>

- There is a custom world generator built specifically for this plugin's overworld dimension. It's hard to describe exactly what it does, but it certainly is interesting.
- Every time you respawn from a bed, there is a 1 in 25 chance that the bed goes up in flames
- Creeper explosions are much larger and cause fire
- All mobs spawn with Strength, Resistance, and Speed
- Chests and Barrels cannot be crafted
- Endermen are automatically aggravated at the nearest player
- All Endermites and Silverfish spawn with Fire Resistance, Strength II, and Resistance III
- Mobs that can spawn in the End include: Guardians, Vexes, Cave Spiders, Witches, Wither Skeletons, Strays, Silverfish, Phantoms, Vindicators, and Pillagers
- If you get set on fire there is no way to put yourself out
- Right-clicking a crafting table has a 1 in 15 chance to make the block explode
- Anvils will fall on every player in the overworld every once in a while
- Furnaces have a chance to be infested with bees
- Furnaces have a 1 in 32 chance to melt with each item that is smelted
- Witches and Ravagers can spawn in the Nether
- Having 29 unique items in your inventory will clear 12 of them
- Breaking leaves either spawns a Witch riding a Bat, or a Witch riding an angry Bee
- Knockback is reversed on non-player entities
- Every once in a while you will have to answer a binomial multiplication question
- An Endermite will spawn near players in the Nether every once in a while
- Phantoms can spawn in the Nether
- Two Endermites will spawn along with every normal mob in the Nether
- Breaking Netherrack turns the block into Deepslate before being broken, which can contain yet another Endermite
- You cannot place chest boats
- Crouching sets you on fire
- Wearing diamond armor will give you the Wither effect
- Trying to place a bed in the end will kill you
- Lava buckets are too hot to be picked up
- You cannot use your offhand
- Phantoms have Fire Resistance
- Your health must be between 14 and 15 in order to set your spawn
- Using a bed will set you on fire no matter what your health already is at
- Sprinting will give you a chance to trip and drop all of your items
- Standing still for a bit will make you die of being too boring
- In the world generation, end frames spawn Houses of Inadequacy. To get them, right click them and the item will drop. This will also spawn 12 silverfish.
- Pufferfish will drop near players every once in a while
- You can randomly get a ton of speed in the Nether
- Totems of Strays will spawn where you can only damage the top
- Entities that can randomly spawn around Overworld Players include: Blazes (will not drop rods), Ghasts, large Magma Cubes, large Phantoms, and Ravagers 
- Breaking a stone block can spawn: Bees, Cave Spiders, Silverfish, normal Spiders, Endermites, and small Magma Cubes
- Zombified Piglins are automatically angry at the nearest player
</details>

# Credits:
[FastNoiseLite](https://github.com/Auburn/FastNoiseLite) - Easy to use library for generating noise maps - used in world generation changes