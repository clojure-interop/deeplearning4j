(ns org.datavec.image.recordreader.objdetect.ImageObjectLabelProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader.objdetect ImageObjectLabelProvider]))

(defn get-image-objects-for-path
  "path - `java.lang.String`

  returns: `java.util.List<org.datavec.image.recordreader.objdetect.ImageObject>`"
  (^java.util.List [^ImageObjectLabelProvider this ^java.lang.String path]
    (-> this (.getImageObjectsForPath path))))

