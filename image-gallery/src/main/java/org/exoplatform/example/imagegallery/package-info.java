@juzu.Application(defaultController = org.exoplatform.example.imagegallery.ImageGalleryApplication.class)

@juzu.plugin.asset.Assets("*")

@Scripts 
(
    {
      @Script(id = "jquery", value = "js/jquery.js"),
      @Script(value = "js/bootstrap-carousel.js", id="bootstrap-carousel", depends="jquery"),
      @Script(value = "js/gallery.js", depends = {"jquery", "bootstrap-carousel"}, location=AssetLocation.APPLICATION)
    }
)

@Stylesheets ({
    @Stylesheet(value = "css/bootstrap.css", location = AssetLocation.APPLICATION, id="bootstrap"),
    @Stylesheet(value = "css/gallery.css", location = AssetLocation.APPLICATION)
})

package org.exoplatform.example.imagegallery;

import juzu.asset.AssetLocation;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Scripts;
import juzu.plugin.asset.Stylesheet;import juzu.plugin.asset.Stylesheets;

