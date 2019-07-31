(ns org.datavec.image.transform.ResizeImageTransform
  "ResizeImageTransform is suited to force the same image size for whole pipeline
 and it doesn't use any random factor for width and height.
 If you need to use random scales to scale or crop the images,
 these links might be helpful ScaleImageTransform or ScaleImageTransform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ResizeImageTransform]))

(defn ->resize-image-transform
  "Constructor.

  Returns new ResizeImageTransform object

  random - Random - `java.util.Random`
  new-width - new Width for the outcome images - `int`
  new-height - new Height for outcome images - `int`"
  (^ResizeImageTransform [^java.util.Random random ^Integer new-width ^Integer new-height]
    (new ResizeImageTransform random new-width new-height))
  (^ResizeImageTransform [^Integer new-width ^Integer new-height]
    (new ResizeImageTransform new-width new-height)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^ResizeImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

