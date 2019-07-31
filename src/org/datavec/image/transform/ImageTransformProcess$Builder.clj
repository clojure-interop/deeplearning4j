(ns org.datavec.image.transform.ImageTransformProcess$Builder
  "Builder class for constructing a ImageTransformProcess"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ImageTransformProcess$Builder]))

(defn ->builder
  "Constructor."
  (^ImageTransformProcess$Builder []
    (new ImageTransformProcess$Builder )))

(defn flip-image-transform
  "flip-mode - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer flip-mode]
    (-> this (.flipImageTransform flip-mode))))

(defn resize-image-transform
  "new-width - `int`
  new-height - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer new-width ^Integer new-height]
    (-> this (.resizeImageTransform new-width new-height))))

(defn equalize-hist-transform
  "conversion-code - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer conversion-code]
    (-> this (.equalizeHistTransform conversion-code))))

(defn filter-image-transform
  "filters - `java.lang.String`
  width - `int`
  height - `int`
  channels - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^java.lang.String filters ^Integer width ^Integer height ^Integer channels]
    (-> this (.filterImageTransform filters width height channels)))
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^java.lang.String filters ^Integer width ^Integer height]
    (-> this (.filterImageTransform filters width height))))

(defn seed
  "seed - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer seed]
    (-> this (.seed seed))))

(defn build
  "returns: `org.datavec.image.transform.ImageTransformProcess`"
  (^org.datavec.image.transform.ImageTransformProcess [^ImageTransformProcess$Builder this]
    (-> this (.build))))

(defn rotate-image-transform
  "centerx - `float`
  centery - `float`
  angle - `float`
  scale - `float`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Float centerx ^Float centery ^Float angle ^Float scale]
    (-> this (.rotateImageTransform centerx centery angle scale)))
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Float angle]
    (-> this (.rotateImageTransform angle))))

(defn warp-image-transform
  "dx-1 - `float`
  dy-1 - `float`
  dx-2 - `float`
  dy-2 - `float`
  dx-3 - `float`
  dy-3 - `float`
  dx-4 - `float`
  dy-4 - `float`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Float dx-1 ^Float dy-1 ^Float dx-2 ^Float dy-2 ^Float dx-3 ^Float dy-3 ^Float dx-4 ^Float dy-4]
    (-> this (.warpImageTransform dx-1 dy-1 dx-2 dy-2 dx-3 dy-3 dx-4 dy-4)))
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Float delta]
    (-> this (.warpImageTransform delta))))

(defn color-conversion-transform
  "conversion-code - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer conversion-code]
    (-> this (.colorConversionTransform conversion-code))))

(defn random-crop-transform
  "seed - `long`
  height - `int`
  width - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Long seed ^Integer height ^Integer width]
    (-> this (.randomCropTransform seed height width)))
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer height ^Integer width]
    (-> this (.randomCropTransform height width))))

(defn crop-image-transform
  "crop-top - `int`
  crop-left - `int`
  crop-bottom - `int`
  crop-right - `int`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer crop-top ^Integer crop-left ^Integer crop-bottom ^Integer crop-right]
    (-> this (.cropImageTransform crop-top crop-left crop-bottom crop-right)))
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Integer crop]
    (-> this (.cropImageTransform crop))))

(defn scale-image-transform
  "dx - `float`
  dy - `float`

  returns: `org.datavec.image.transform.ImageTransformProcess$Builder`"
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Float dx ^Float dy]
    (-> this (.scaleImageTransform dx dy)))
  (^org.datavec.image.transform.ImageTransformProcess$Builder [^ImageTransformProcess$Builder this ^Float delta]
    (-> this (.scaleImageTransform delta))))

