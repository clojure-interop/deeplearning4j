(ns org.datavec.image.mnist.draw.DrawReconstruction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.mnist.draw DrawReconstruction]))

(defn ->draw-reconstruction
  "Constructor.

  data - `org.nd4j.linalg.api.ndarray.INDArray`
  height-offset - `int`
  width-offset - `int`"
  (^DrawReconstruction [^org.nd4j.linalg.api.ndarray.INDArray data ^Integer height-offset ^Integer width-offset]
    (new DrawReconstruction data height-offset width-offset))
  (^DrawReconstruction [^org.nd4j.linalg.api.ndarray.INDArray data]
    (new DrawReconstruction data)))

(defn frame
  "Instance Field.

  type: javax.swing.JFrame"
  (^javax.swing.JFrame [^DrawReconstruction this]
    (-> this .-frame)))

(defn title
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^DrawReconstruction this]
    (-> this .-title)))

(defn readjust-to-data
  ""
  ([^DrawReconstruction this]
    (-> this (.readjustToData))))

(defn draw
  ""
  ([^DrawReconstruction this]
    (-> this (.draw))))

(defn close
  ""
  ([^DrawReconstruction this]
    (-> this (.close))))

(defn get-image
  "returns: `java.awt.Image`"
  (^java.awt.Image [^DrawReconstruction this]
    (-> this (.getImage))))

(defn start
  ""
  ([^DrawReconstruction this]
    (-> this (.start))))

