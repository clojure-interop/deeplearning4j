(ns org.datavec.image.transform.BoxImageTransform
  "Boxes images to a given width and height without changing their aspect ratios,
 or the size of the objects, by either padding or cropping them from the center.
 When the width/height of an image is less than the given width/height, it gets
 padded in that dimension, otherwise it gets cropped."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform BoxImageTransform]))

(defn ->box-image-transform
  "Constructor.

  Constructs an instance of the ImageTransform.

  random - object to use (or null for deterministic) - `java.util.Random`
  width - of the boxed image (pixels) - `int`
  height - of the boxed image (pixels) - `int`"
  (^BoxImageTransform [^java.util.Random random ^Integer width ^Integer height]
    (new BoxImageTransform random width height))
  (^BoxImageTransform [^Integer width ^Integer height]
    (new BoxImageTransform width height)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^BoxImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

