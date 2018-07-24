package com.blrobin2;

import java.util.List;

public interface Saveable {
    List<String> write();
    void read(List<String> saveValues);
}
