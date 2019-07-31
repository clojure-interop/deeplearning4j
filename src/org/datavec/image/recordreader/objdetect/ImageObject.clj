(ns org.datavec.image.recordreader.objdetect.ImageObject
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader.objdetect ImageObject]))

(defn ->image-object
  "Constructor.

  x-1 - `int`
  y-1 - `int`
  x-2 - `int`
  y-2 - `int`
  label - `java.lang.String`"
  (^ImageObject [^Integer x-1 ^Integer y-1 ^Integer x-2 ^Integer y-2 ^java.lang.String label]
    (new ImageObject x-1 y-1 x-2 y-2 label)))

(defn get-x-center-pixels
  "returns: `double`"
  (^Double [^ImageObject this]
    (-> this (.getXCenterPixels))))

(defn get-y-center-pixels
  "returns: `double`"
  (^Double [^ImageObject this]
    (-> this (.getYCenterPixels))))

