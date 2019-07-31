(ns org.datavec.image.transform.CropImageTransform
  "Crops images deterministically or randomly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform CropImageTransform]))

(defn ->crop-image-transform
  "Constructor.

  Constructs an instance of the ImageTransform.

  random - object to use (or null for deterministic) - `java.util.Random`
  crop-top - maximum cropping of the top of the image (pixels) - `int`
  crop-left - maximum cropping of the left of the image (pixels) - `int`
  crop-bottom - maximum cropping of the bottom of the image (pixels) - `int`
  crop-right - maximum cropping of the right of the image (pixels) - `int`"
  (^CropImageTransform [^java.util.Random random ^Integer crop-top ^Integer crop-left ^Integer crop-bottom ^Integer crop-right]
    (new CropImageTransform random crop-top crop-left crop-bottom crop-right))
  (^CropImageTransform [^Integer crop-top ^Integer crop-left ^Integer crop-bottom ^Integer crop-right]
    (new CropImageTransform crop-top crop-left crop-bottom crop-right))
  (^CropImageTransform [^java.util.Random random ^Integer crop]
    (new CropImageTransform random crop))
  (^CropImageTransform [^Integer crop]
    (new CropImageTransform crop)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^CropImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

