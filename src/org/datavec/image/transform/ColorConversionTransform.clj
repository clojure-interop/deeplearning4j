(ns org.datavec.image.transform.ColorConversionTransform
  "Color conversion transform using CVT (cvtcolor):
 CVT Color.
 More CVT Color."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ColorConversionTransform]))

(defn ->color-conversion-transform
  "Constructor.

  Return new ColorConversion object

  random - Random - `java.util.Random`
  conversion-code - to transform, - `int`"
  (^ColorConversionTransform [^java.util.Random random ^Integer conversion-code]
    (new ColorConversionTransform random conversion-code))
  (^ColorConversionTransform [^Integer conversion-code]
    (new ColorConversionTransform conversion-code))
  (^ColorConversionTransform []
    (new ColorConversionTransform )))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^ColorConversionTransform this ^Float coordinates]
    (-> this (.query coordinates))))

