(ns org.deeplearning4j.datasets.mnist.MnistImageFile
  "MNIST database image file. Contains additional header information for the
 number of rows and columns per each entry."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.mnist MnistImageFile]))

(defn ->mnist-image-file
  "Constructor.

  Creates new MNIST database image file ready for reading.

  name - the system-dependent filename - `java.lang.String`
  mode - the access mode - `java.lang.String`

  throws: java.io.IOException"
  (^MnistImageFile [^java.lang.String name ^java.lang.String mode]
    (new MnistImageFile name mode)))

(defn read-image
  "Reads the image at the current position.

  returns: matrix representing the image - `int[][]`

  throws: java.io.IOException"
  ([^MnistImageFile this]
    (-> this (.readImage))))

(defn read-images-unsafe
  "Read the specified number of images from the current position, to a byte[nImages][rows*cols]
  Note that MNIST data set is stored as unsigned bytes; this method returns signed bytes without conversion
  (i.e., same bits, but requires conversion before use)

  n-images - Number of images - `int`

  returns: `byte[][]`

  throws: java.io.IOException"
  ([^MnistImageFile this ^Integer n-images]
    (-> this (.readImagesUnsafe n-images))))

(defn next-image
  "Move the cursor to the next image.

  throws: java.io.IOException"
  ([^MnistImageFile this]
    (-> this (.nextImage))))

(defn prev-image
  "Move the cursor to the previous image.

  throws: java.io.IOException"
  ([^MnistImageFile this]
    (-> this (.prevImage))))

(defn get-rows
  "Number of rows per image.

  returns: int - `int`"
  (^Integer [^MnistImageFile this]
    (-> this (.getRows))))

(defn get-cols
  "Number of columns per image.

  returns: int - `int`"
  (^Integer [^MnistImageFile this]
    (-> this (.getCols))))

(defn get-entry-length
  "Description copied from class: MnistDbFile

  returns: int - `int`"
  (^Integer [^MnistImageFile this]
    (-> this (.getEntryLength))))

(defn get-header-size
  "returns: `int`"
  (^Integer [^MnistImageFile this]
    (-> this (.getHeaderSize))))

