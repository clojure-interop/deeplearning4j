(ns org.datavec.image.transform.EqualizeHistTransform
  "\"Histogram Equalization equalizes the intensity distribution of an image or flattens the intensity distribution curve.
 Used to improve the contrast of an image.\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform EqualizeHistTransform]))

(defn ->equalize-hist-transform
  "Constructor.

  Return contrast normalized object

  random - Random - `java.util.Random`
  conversion-code - to transform, - `int`"
  (^EqualizeHistTransform [^java.util.Random random ^Integer conversion-code]
    (new EqualizeHistTransform random conversion-code))
  (^EqualizeHistTransform [^Integer conversion-code]
    (new EqualizeHistTransform conversion-code))
  (^EqualizeHistTransform []
    (new EqualizeHistTransform )))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^EqualizeHistTransform this ^Float coordinates]
    (-> this (.query coordinates))))

