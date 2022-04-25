package by.guzypaul.blockchain.service;

import by.guzypaul.blockchain.entity.Block;
import by.guzypaul.blockchain.util.StringUtil;

public class HashCalculator {
    public String calculateHash(Block block) {
        String calculatedhash = StringUtil.applySha256(
                block.previousHash + Long.toString(block.timeStamp) + block.data);
        return calculatedhash;
    }
}
