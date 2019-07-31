(ns org.datavec.image.transform.FlipImageTransform
  "Flips images deterministically or randomly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform FlipImageTransform]))

(defn ->flip-image-transform
  "Constructor.

  Calls this(null) and sets the flip mode.

  flip-mode - the deterministic flip mode0 Flips around x-axis.>0 Flips around y-axis.<0 Flips around both axes. - `int`"
  (^FlipImageTransform [^Integer flip-mode]
    (new FlipImageTransform flip-mode))
  (^FlipImageTransform []
    (new FlipImageTransform )))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^FlipImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

