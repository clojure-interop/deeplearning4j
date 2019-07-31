(ns org.datavec.image.recordreader.objdetect.impl.SvhnLabelProvider
  "Label provider for object detection, for use with ObjectDetectionRecordReader.
 This label provider reads the datasets from The Street View House Numbers (SVHN) Dataset.
 The SVHN datasets contain 10 classes (digits) with 73257 digits for training, 26032 digits for testing, and 531131 additional.
 http://ufldl.stanford.edu/housenumbers/


 How to use:
 1. Download and extract SVHN dataset with SvhnDataFetcher
 2. Set baseDirectory to (for example) \"training\" directory (should contain PNG images and a digitStruct.mat file)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.recordreader.objdetect.impl SvhnLabelProvider]))

(defn ->svhn-label-provider
  "Constructor.

  dir - `java.io.File`

  throws: java.io.IOException"
  (^SvhnLabelProvider [^java.io.File dir]
    (new SvhnLabelProvider dir)))

(defn get-image-objects-for-path
  "path - `java.lang.String`

  returns: `java.util.List<org.datavec.image.recordreader.objdetect.ImageObject>`"
  (^java.util.List [^SvhnLabelProvider this ^java.lang.String path]
    (-> this (.getImageObjectsForPath path))))

