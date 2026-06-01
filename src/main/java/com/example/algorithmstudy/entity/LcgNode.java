package com.example.algorithmstudy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author licangui
 * @date 2026/5/22 13:08
 * @Description 节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LcgNode {
    int i;
    public LcgNode next;
}

