(ns org.datavec.image.transform.BaseImageTransform
  "Implements the ImageTransform interface by providing its subclasses
 with a random object to use in the case of random transformations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform BaseImageTransform]))

(defn transform
  "Description copied from interface: ImageTransform

  image - to transform, null == end of stream - `org.datavec.image.data.ImageWritable`
  random - object to use (or null for deterministic) - `java.util.Random`

  returns: transformed image - `org.datavec.image.data.ImageWritable`"
  (^org.datavec.image.data.ImageWritable [^BaseImageTransform this ^org.datavec.image.data.ImageWritable image ^java.util.Random random]
    (-> this (.transform image random)))
  (^org.datavec.image.data.ImageWritable [^BaseImageTransform this ^org.datavec.image.data.ImageWritable image]
    (-> this (.transform image))))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^BaseImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

(defn get-current-image
  "Description copied from interface: ImageTransform

  returns: Last transformed image or null - `org.datavec.image.data.ImageWritable`"
  (^org.datavec.image.data.ImageWritable [^BaseImageTransform this]
    (-> this (.getCurrentImage))))

