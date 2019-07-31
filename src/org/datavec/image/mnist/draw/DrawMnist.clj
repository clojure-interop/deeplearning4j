(ns org.datavec.image.mnist.draw.DrawMnist
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.mnist.draw DrawMnist]))

(defn ->draw-mnist
  "Constructor."
  (^DrawMnist []
    (new DrawMnist )))

(defn *draw-mnist
  "mnist - `org.nd4j.linalg.dataset.DataSet`
  reconstruct - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.InterruptedException"
  ([^org.nd4j.linalg.dataset.DataSet mnist ^org.nd4j.linalg.api.ndarray.INDArray reconstruct]
    (DrawMnist/drawMnist mnist reconstruct)))

