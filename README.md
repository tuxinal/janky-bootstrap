# Janky Bootstrapper

a very simple (and janky) bootstraper for packwiz on the vanilla launcher  

This is very temporary awaiting [packwiz-installer-bootstrap](https://github.com/packwiz/packwiz-installer-bootstrap)'s own chainloader functionality  

Doesn't update the packwiz version and it might cause classpath conflicts due to the dependencies which are loaded through the profile (although i haven't seen this happen, even with fabric-language-kotlin installed which in theory would've had conflicts)

## Usage

Note: The template is preconfigured for fabric. you need to have fabric loader installed before you proceed. Fabric loader's version is also not updated.

1. Copy [`template-version.json`](./template-version.json) and rename it to your own version ID (e.g. `my-packwiz-version.json`)
2. Edit the file and supply your own configurations, namely `FABRIC_LOADER_VERSION` (in the format of it's ID when it's in your `.minecraft/versions` folder, e.g. `fabric-loader-0.14.10-1.19.2`) and `YOUR_PACK_URL`. make sure the id is correct
3. Put your version file in a folder of the same name (i.e. `my-packwiz-version/my-packwiz-version.json`) and put the folder inside `.minecraft/versions`

and you should now have a new version in your launcher which will launch packwiz-installer upon launch and then proceed to open minecraft itself  
i'd also recommend changing your work directory to something besides the default one
