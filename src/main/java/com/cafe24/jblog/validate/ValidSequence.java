package com.cafe24.jblog.validate;

import javax.validation.GroupSequence;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@GroupSequence({Default.class, Second.class})
public interface ValidSequence {

}
