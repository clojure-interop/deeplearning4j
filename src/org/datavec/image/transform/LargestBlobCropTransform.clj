(ns org.datavec.image.transform.LargestBlobCropTransform
  "crop images based on it's largest blob. Calls internally
 org.bytedeco.javacpp.opencv_imgproc#blur(Mat, Mat, Size)
 org.bytedeco.javacpp.opencv_imgproc#Canny(Mat ,Mat, double, double)
 org.bytedeco.javacpp.opencv_imgproc#threshold(Mat, Mat, double, double, int)
 org.bytedeco.javacpp.opencv_imgproc#findContours(Mat, MatVector, Mat, int, int)
 org.bytedeco.javacpp.opencv_imgproc#contourArea(Mat, boolean)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform LargestBlobCropTransform]))

(defn ->largest-blob-crop-transform
  "Constructor.

  Calls this(random, CV_RETR_CCOMP, CV_CHAIN_APPROX_SIMPLE, 3, 3, 100, 200, true)

  random - `java.util.Random`"
  (^LargestBlobCropTransform [^java.util.Random random]
    (new LargestBlobCropTransform random))
  (^LargestBlobCropTransform []
    (new LargestBlobCropTransform ))
  (^LargestBlobCropTransform [^java.util.Random random ^Integer mode ^Integer method ^Integer blur-width ^Integer blur-height ^Integer lower-thresh ^Integer upper-thresh ^Boolean is-canny]
    (new LargestBlobCropTransform random mode method blur-width blur-height lower-thresh upper-thresh is-canny)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^LargestBlobCropTransform this ^Float coordinates]
    (-> this (.query coordinates))))

