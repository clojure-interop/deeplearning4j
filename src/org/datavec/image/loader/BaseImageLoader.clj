(ns org.datavec.image.loader.BaseImageLoader
  "Created by nyghtowl on 12/17/15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader BaseImageLoader]))

(defn ->base-image-loader
  "Constructor."
  (^BaseImageLoader []
    (new BaseImageLoader )))

(def *-base-dir
  "Static Constant.

  type: java.io.File"
  BaseImageLoader/BASE_DIR)

(def *-allowed-formats
  "Static Constant.

  type: java.lang.String[]"
  BaseImageLoader/ALLOWED_FORMATS)

(defn *download-and-untar
  "url-map - `java.util.Map`
  full-dir - `java.io.File`"
  ([^java.util.Map url-map ^java.io.File full-dir]
    (BaseImageLoader/downloadAndUntar url-map full-dir)))

(defn get-allowed-formats
  "returns: `java.lang.String[]`"
  ([^BaseImageLoader this]
    (-> this (.getAllowedFormats))))

(defn as-row-vector
  "f - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseImageLoader this ^java.io.File f]
    (-> this (.asRowVector f))))

(defn as-matrix
  "f - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseImageLoader this ^java.io.File f]
    (-> this (.asMatrix f))))

(defn as-image-matrix
  "f - `java.io.File`

  returns: `org.datavec.image.data.Image`

  throws: java.io.IOException"
  (^org.datavec.image.data.Image [^BaseImageLoader this ^java.io.File f]
    (-> this (.asImageMatrix f))))

