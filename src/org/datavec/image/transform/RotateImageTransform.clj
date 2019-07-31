(ns org.datavec.image.transform.RotateImageTransform
  "Rotates and scales images deterministically or randomly. Calls
 org.bytedeco.javacpp.opencv_imgproc#warpAffine(Mat, Mat, Mat, Size, int, int, Scalar)
 with given properties (interMode, borderMode, and borderValue)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform RotateImageTransform]))

(defn ->rotate-image-transform
  "Constructor.

  Constructs an instance of the ImageTransform.

  random - object to use (or null for deterministic) - `java.util.Random`
  centerx - maximum deviation in x of center of rotation (relative to image center) - `float`
  centery - maximum deviation in y of center of rotation (relative to image center) - `float`
  angle - maximum rotation (degrees) - `float`
  scale - maximum scaling (relative to 1) - `float`"
  (^RotateImageTransform [^java.util.Random random ^Float centerx ^Float centery ^Float angle ^Float scale]
    (new RotateImageTransform random centerx centery angle scale))
  (^RotateImageTransform [^Float centerx ^Float centery ^Float angle ^Float scale]
    (new RotateImageTransform centerx centery angle scale))
  (^RotateImageTransform [^java.util.Random random ^Float angle]
    (new RotateImageTransform random angle))
  (^RotateImageTransform [^Float angle]
    (new RotateImageTransform angle)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^RotateImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

