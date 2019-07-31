(ns org.datavec.image.transform.ShowImageTransform
  "Shows images on the screen, does not actually transform them.
 To continue to the next image, press any key in the window of the CanvasFrame."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ShowImageTransform]))

(defn ->show-image-transform
  "Constructor.

  Constructs an instance of the ImageTransform from a CanvasFrame.

  canvas - to display images in - `org.bytedeco.javacv.CanvasFrame`
  delay - max time to wait in milliseconds (0 == infinity, negative == no wait) - `int`"
  (^ShowImageTransform [^org.bytedeco.javacv.CanvasFrame canvas ^Integer delay]
    (new ShowImageTransform canvas delay))
  (^ShowImageTransform [^org.bytedeco.javacv.CanvasFrame canvas]
    (new ShowImageTransform canvas)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^ShowImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

