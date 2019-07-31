(ns org.datavec.image.mnist.MnistLabelFile
  "MNIST database label file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.mnist MnistLabelFile]))

(defn ->mnist-label-file
  "Constructor.

  Creates new MNIST database label file ready for reading.

  name - the system-dependent filename - `java.lang.String`
  mode - the access mode - `java.lang.String`

  throws: java.io.IOException"
  (^MnistLabelFile [^java.lang.String name ^java.lang.String mode]
    (new MnistLabelFile name mode)))

(defn read-label
  "Reads the integer at the current position.

  returns: integer representing the label - `int`

  throws: java.io.IOException"
  (^Integer [^MnistLabelFile this]
    (-> this (.readLabel))))

