(ns org.datavec.image.transform.ScaleImageTransform
  "ScaleImageTransform is aim to scale by a certain random factor,
 not the final size of the image."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ScaleImageTransform]))

(defn ->scale-image-transform
  "Constructor.

  Constructs an instance of the ImageTransform.

  random - object to use (or null for deterministic) - `java.util.Random`
  dx - maximum scaling in width of the image (pixels) - `float`
  dy - maximum scaling in height of the image (pixels) - `float`"
  (^ScaleImageTransform [^java.util.Random random ^Float dx ^Float dy]
    (new ScaleImageTransform random dx dy))
  (^ScaleImageTransform [^java.util.Random random ^Float delta]
    (new ScaleImageTransform random delta))
  (^ScaleImageTransform [^Float delta]
    (new ScaleImageTransform delta)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^ScaleImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

