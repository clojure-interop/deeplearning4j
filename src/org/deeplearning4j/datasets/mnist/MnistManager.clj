(ns org.deeplearning4j.datasets.mnist.MnistManager
  "Utility class for working with the MNIST database.

 Provides methods for traversing the images and labels data files separately,
 as well as simultaneously.

 Provides also method for exporting an image by writing it as a PPM file.

 Example usage:


   MnistManager m = new MnistManager(\"t10k-images.idx3-ubyte\", \"t10k-labels.idx1-ubyte\");
   m.setCurrent(10); //index of the image that we are interested in
   int[][] image = m.readImage();
   System.out.println(\"Label:\"  m.readLabel());
   MnistManager.writeImageToPpm(image, \"10.ppm\");"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.mnist MnistManager]))

(defn ->mnist-manager
  "Constructor.

  Constructs an instance managing the two given data files. Supports
  NULL value for one of the arguments in case reading only one
  of the files (images and labels) is required.

  images-file - Can be NULL. In that case all future operationsusing that file will fail. - `java.lang.String`
  labels-file - Can be NULL. In that case all future operationsusing that file will fail. - `java.lang.String`
  train - `boolean`

  throws: java.io.IOException"
  (^MnistManager [^java.lang.String images-file ^java.lang.String labels-file ^Boolean train]
    (new MnistManager images-file labels-file train))
  (^MnistManager [^java.lang.String images-file ^java.lang.String labels-file]
    (new MnistManager images-file labels-file)))

(defn *write-image-to-ppm
  "Writes the given image in the given file using the PPM data format.

  image - `int[][]`
  ppm-file-name - `java.lang.String`

  throws: java.io.IOException"
  ([image ^java.lang.String ppm-file-name]
    (MnistManager/writeImageToPpm image ppm-file-name)))

(defn read-image
  "Reads the current image.

  returns: matrix - `int[][]`

  throws: java.io.IOException"
  ([^MnistManager this]
    (-> this (.readImage))))

(defn read-image-unsafe
  "i - `int`

  returns: `byte[]`"
  ([^MnistManager this ^Integer i]
    (-> this (.readImageUnsafe i))))

(defn set-current
  "Set the position to be read.

  index - `int`"
  ([^MnistManager this ^Integer index]
    (-> this (.setCurrent index))))

(defn read-label
  "Reads the current label.

  returns: int - `int`

  throws: java.io.IOException"
  (^Integer [^MnistManager this]
    (-> this (.readLabel)))
  (^Integer [^MnistManager this ^Integer i]
    (-> this (.readLabel i))))

(defn get-images
  "Get the underlying images file as MnistImageFile.

  returns: MnistImageFile. - `org.deeplearning4j.datasets.mnist.MnistImageFile`"
  (^org.deeplearning4j.datasets.mnist.MnistImageFile [^MnistManager this]
    (-> this (.getImages))))

(defn get-labels
  "Get the underlying labels file as MnistLabelFile.

  returns: MnistLabelFile. - `org.deeplearning4j.datasets.mnist.MnistLabelFile`"
  (^org.deeplearning4j.datasets.mnist.MnistLabelFile [^MnistManager this]
    (-> this (.getLabels))))

(defn close
  "Close any resources opened by the manager."
  ([^MnistManager this]
    (-> this (.close))))

