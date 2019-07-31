(ns org.datavec.image.transform.MultiImageTransform
  "Transforms images deterministically or randomly with the help of an array of ImageTransform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform MultiImageTransform]))

(defn ->multi-image-transform
  "Constructor.

  random - `java.util.Random`
  transforms - `org.datavec.image.transform.ImageTransform`"
  (^MultiImageTransform [^java.util.Random random ^org.datavec.image.transform.ImageTransform transforms]
    (new MultiImageTransform random transforms))
  (^MultiImageTransform [^org.datavec.image.transform.ImageTransform transforms]
    (new MultiImageTransform transforms)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^MultiImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

