(ns org.datavec.image.transform.WarpImageTransform
  "Warps the perspective of images deterministically or randomly. Calls
 org.bytedeco.javacpp.opencv_imgproc#warpPerspective(Mat, Mat, Mat, Size, int, int, Scalar)
 with given properties (interMode, borderMode, and borderValue)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform WarpImageTransform]))

(defn ->warp-image-transform
  "Constructor.

  Constructs an instance of the ImageTransform.

  random - object to use (or null for deterministic) - `java.util.Random`
  dx-1 - maximum warping in x for the top-left corner (pixels) - `float`
  dy-1 - maximum warping in y for the top-left corner (pixels) - `float`
  dx-2 - maximum warping in x for the top-right corner (pixels) - `float`
  dy-2 - maximum warping in y for the top-right corner (pixels) - `float`
  dx-3 - maximum warping in x for the bottom-right corner (pixels) - `float`
  dy-3 - maximum warping in y for the bottom-right corner (pixels) - `float`
  dx-4 - maximum warping in x for the bottom-left corner (pixels) - `float`
  dy-4 - maximum warping in y for the bottom-left corner (pixels) - `float`"
  (^WarpImageTransform [^java.util.Random random ^Float dx-1 ^Float dy-1 ^Float dx-2 ^Float dy-2 ^Float dx-3 ^Float dy-3 ^Float dx-4 ^Float dy-4]
    (new WarpImageTransform random dx-1 dy-1 dx-2 dy-2 dx-3 dy-3 dx-4 dy-4))
  (^WarpImageTransform [^Float dx-1 ^Float dy-1 ^Float dx-2 ^Float dy-2 ^Float dx-3 ^Float dy-3 ^Float dx-4 ^Float dy-4]
    (new WarpImageTransform dx-1 dy-1 dx-2 dy-2 dx-3 dy-3 dx-4 dy-4))
  (^WarpImageTransform [^java.util.Random random ^Float delta]
    (new WarpImageTransform random delta))
  (^WarpImageTransform [^Float delta]
    (new WarpImageTransform delta)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^WarpImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

