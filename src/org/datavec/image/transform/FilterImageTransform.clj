(ns org.datavec.image.transform.FilterImageTransform
  "Filters images using FFmpeg (libavfilter):
 FFmpeg Filters Documentation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform FilterImageTransform]))

(defn ->filter-image-transform
  "Constructor.

  Constructs a filtergraph out of the filter specification.

  filters - to use - `java.lang.String`
  width - of the input images - `int`
  height - of the input images - `int`
  channels - of the input images - `int`"
  (^FilterImageTransform [^java.lang.String filters ^Integer width ^Integer height ^Integer channels]
    (new FilterImageTransform filters width height channels))
  (^FilterImageTransform [^java.lang.String filters ^Integer width ^Integer height]
    (new FilterImageTransform filters width height)))

