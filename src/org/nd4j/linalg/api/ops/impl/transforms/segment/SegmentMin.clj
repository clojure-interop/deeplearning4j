(ns org.nd4j.linalg.api.ops.impl.transforms.segment.SegmentMin
  "Segment min operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.segment SegmentMin]))

(defn ->segment-min
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`"
  (^SegmentMin [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (new SegmentMin same-diff data segment-ids))
  (^SegmentMin []
    (new SegmentMin )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SegmentMin this]
    (-> this (.opName))))

