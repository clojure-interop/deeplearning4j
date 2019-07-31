(ns org.datavec.image.transform.RandomCropTransform
  "Randomly crops an image to a desired output size. Will determine if
 output size is valid, otherwise will throw an error."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform RandomCropTransform]))

(defn ->random-crop-transform
  "Constructor.

  random - `java.util.Random`
  seed - `long`
  height - `int`
  width - `int`"
  (^RandomCropTransform [^java.util.Random random ^Long seed ^Integer height ^Integer width]
    (new RandomCropTransform random seed height width))
  (^RandomCropTransform [^Long seed ^Integer height ^Integer width]
    (new RandomCropTransform seed height width))
  (^RandomCropTransform [^Integer height ^Integer width]
    (new RandomCropTransform height width)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^RandomCropTransform this ^Float coordinates]
    (-> this (.query coordinates))))

