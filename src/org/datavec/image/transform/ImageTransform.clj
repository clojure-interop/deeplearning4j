(ns org.datavec.image.transform.ImageTransform
  "Transforms an image in some way, either deterministically or randomly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ImageTransform]))

(defn transform
  "Takes an image and returns a transformed image.
  Uses the random object in the case of random transformations.

  image - to transform, null == end of stream - `org.datavec.image.data.ImageWritable`
  random - object to use (or null for deterministic) - `java.util.Random`

  returns: transformed image - `org.datavec.image.data.ImageWritable`"
  (^org.datavec.image.data.ImageWritable [^ImageTransform this ^org.datavec.image.data.ImageWritable image ^java.util.Random random]
    (-> this (.transform image random)))
  (^org.datavec.image.data.ImageWritable [^ImageTransform this ^org.datavec.image.data.ImageWritable image]
    (-> this (.transform image))))

(defn query
  "Transforms the given coordinates using the parameters that were used to transform the last image.

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^ImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

(defn get-current-image
  "Returns the last transformed image or null if none transformed yet.

  returns: Last transformed image or null - `org.datavec.image.data.ImageWritable`"
  (^org.datavec.image.data.ImageWritable [^ImageTransform this]
    (-> this (.getCurrentImage))))

