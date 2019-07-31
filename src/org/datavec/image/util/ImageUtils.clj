(ns org.datavec.image.util.ImageUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.util ImageUtils]))

(defn ->image-utils
  "Constructor."
  (^ImageUtils []
    (new ImageUtils )))

(defn *translate-coords-scale-image
  "Calculate coordinates in an image, assuming the image has been scaled from (oH x oW) pixels to (nH x nW) pixels

  x - X position (pixels) to translate - `double`
  y - Y position (pixels) to translate - `double`
  orig-image-w - Original image width (pixels) - `double`
  orig-image-h - Original image height (pixels) - `double`
  new-image-w - New image width (pixels) - `double`
  new-image-h - New image height (pixels) - `double`

  returns: New X and Y coordinates (pixels, in new image) - `double[]`"
  ([^Double x ^Double y ^Double orig-image-w ^Double orig-image-h ^Double new-image-w ^Double new-image-h]
    (ImageUtils/translateCoordsScaleImage x y orig-image-w orig-image-h new-image-w new-image-h)))

