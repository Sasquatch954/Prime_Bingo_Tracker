import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class bingoTrackerGUI {

    private JButton adultSheegoth;
    private JButton chozoGhosts;
    private JButton chozoSave;
    private JButton elitePirates;
    private JButton flyingPirates;
    private JButton iceWithIcespreader;
    private JButton magmoorSave;
    private JButton metroids;
    private JButton minesSave;
    private JButton phendranaSave;
    private JButton plasmaWithFlamethrower;
    private JButton platedBeetle;
    private JButton powerWithSupers;
    private JButton powerbombStructures;
    private JButton resetButton;
    private JButton shadowPirates;
    private JButton spinners;
    private JButton superMissleStructures;
    private JButton tallonSave;
    private JButton waveWithWavebuster;
    private JCheckBox activateTheObservatoryCheckBox;
    private JCheckBox allHallOfTheCheckBox;
    private JCheckBox allHunterMetroidsFungalCheckBox;
    private JCheckBox antechamberCheckBox;
    private JCheckBox chapelOfTheEldersCheckBox;
    private JCheckBox chozoMapStationCheckBox;
    private JCheckBox chozoMissleStationCheckBox;
    private JCheckBox cloakedDroneCheckBox;
    private JCheckBox flaaghraCheckBox;
    private JCheckBox hiveMechaCheckBox;
    private JCheckBox incineratorDroneCheckBox;
    private JCheckBox largeEnemyWithFlamthrowerCheckBox;
    private JCheckBox metaRidleyCheckBox;
    private JCheckBox minesMapStationCheckBox;
    private JCheckBox minesMissleStationCheckBox;
    private JCheckBox omegaPirateCheckBox;
    private JCheckBox oneDuplicateOrNothingCheckBox;
    private JCheckBox phendranaMapStationCheckBox;
    private JCheckBox plasmaProcessingCheckBox;
    private JCheckBox thardusCheckBox;
    private JLabel adultSheegothLabel;
    private JLabel chozoGhostsInX;
    private JLabel chozoRuins;
    private JLabel elitePirateLabel;
    private JLabel enemies;
    private JLabel flyingPiratesInX;
    private JLabel icePiratesWithIce;
    private JLabel items;
    private JLabel magmoorCaverns;
    private JLabel majorBosses;
    private JLabel mapStations;
    private JLabel metroidsLabel;
    private JLabel minorBosses;
    private JLabel miscLabel;
    private JLabel objects;
    private JLabel phazonMines;
    private JLabel phendranaDrifts;
    private JLabel plasmaPiratesWithFlamethrower;
    private JLabel platedBeetleLabel;
    private JLabel powerPiratesWithSupers;
    private JLabel rooms;
    private JLabel saveStationCount;
    private JLabel shadowPiratesInX;
    private JLabel spinnersLabel;
    private JLabel stucturesBrokenWithPowerLabel;
    private JLabel superMissleStructuresLabel;
    private JLabel tallonOverworld;
    private JLabel wavePiratesWithWavebuster;
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JSeparator bottom1;
    private JSeparator bottom2;
    private JSeparator bottom3;
    private JSeparator bottom4;
    private JSeparator bottom5;
    private JSeparator bottom6;
    private JSeparator left1;
    private JSeparator left2;
    private JSeparator pan1sep1;
    private JSeparator pan1sep2;
    private JSeparator pan1sep3;
    private JSeparator pan1sep4;
    private JSeparator pan1sep5;
    private JSeparator pan4sep1;
    private JSeparator pan4sep2;
    private JSeparator pan4sep3;
    private JSeparator pan4sep4;
    private JSeparator pan4sep5;
    private JSeparator pan4sep6;
    private JSeparator pan4sep7;
    private JSeparator pan4sep8;
    private JSeparator pan4sep9;
    private JSeparator pan5sep1;
    private JSeparator pan5sep2;
    private JSeparator pan5sep3;
    private JSeparator pan5sep4;
    private JSeparator pan5sep5;
    private JSeparator pan6sep1;
    private JSeparator pan6sep2;
    private JSeparator pan6sep3;
    private JSeparator pan6sep4;
    private JSeparator pan6sep5;
    private JSeparator pan6sep6;
    private JSeparator pan6sep7;
    private JSeparator pan6sep8;
    private JSeparator right1;
    private JSeparator right2;
    private JSeparator top1;
    private JSeparator top2;
    private JSeparator top3;
    private JSeparator top4;
    private JSeparator top5;
    private JSeparator top6;

    private int count   = 0;
    private int count1  = 0;
    private int count2  = 0;
    private int count3  = 0;
    private int count4  = 0;
    private int count5  = 0;
    private int count6  = 0;
    private int count7  = 0;
    private int count8  = 0;
    private int count9  = 0;
    private int count10 = 0;
    private int count11 = 0;
    private int count12 = 0;
    private int count13 = 0;
    private int count14 = 0;
    private int count15 = 0;
    private int count16 = 0;
    private int count17 = 0;
    private int count18 = 0;

    public bingoTrackerGUI() {
        top1.setBackground(Color.DARK_GRAY);
        top1.setForeground(Color.DARK_GRAY);
        top2.setBackground(Color.DARK_GRAY);
        top2.setForeground(Color.DARK_GRAY);
        top3.setBackground(Color.DARK_GRAY);
        top3.setForeground(Color.DARK_GRAY);
        top4.setBackground(Color.DARK_GRAY);
        top4.setForeground(Color.DARK_GRAY);
        top5.setBackground(Color.DARK_GRAY);
        top5.setForeground(Color.DARK_GRAY);
        top6.setBackground(Color.DARK_GRAY);
        top6.setForeground(Color.DARK_GRAY);
        left1.setBackground(Color.DARK_GRAY);
        left1.setForeground(Color.DARK_GRAY);
        left2.setBackground(Color.DARK_GRAY);
        left2.setForeground(Color.DARK_GRAY);
        right1.setBackground(Color.DARK_GRAY);
        right1.setForeground(Color.DARK_GRAY);
        right2.setBackground(Color.DARK_GRAY);
        right2.setForeground(Color.DARK_GRAY);
        bottom1.setBackground(Color.DARK_GRAY);
        bottom1.setForeground(Color.DARK_GRAY);
        bottom2.setBackground(Color.DARK_GRAY);
        bottom2.setForeground(Color.DARK_GRAY);
        bottom3.setBackground(Color.DARK_GRAY);
        bottom3.setForeground(Color.DARK_GRAY);
        bottom4.setBackground(Color.DARK_GRAY);
        bottom4.setForeground(Color.DARK_GRAY);
        bottom5.setBackground(Color.DARK_GRAY);
        bottom5.setForeground(Color.DARK_GRAY);
        bottom6.setBackground(Color.DARK_GRAY);
        bottom6.setForeground(Color.DARK_GRAY);

        panel1.setBackground(Color.WHITE);
        panel1.setForeground(Color.WHITE);
        pan1sep1.setBackground(Color.WHITE);
        pan1sep1.setForeground(Color.WHITE);
        pan1sep2.setBackground(Color.WHITE);
        pan1sep2.setForeground(Color.WHITE);
        pan1sep3.setBackground(Color.WHITE);
        pan1sep3.setForeground(Color.WHITE);
        pan1sep4.setBackground(Color.WHITE);
        pan1sep4.setForeground(Color.WHITE);
        pan1sep5.setBackground(Color.WHITE);
        pan1sep5.setForeground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel2.setForeground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
        panel3.setForeground(Color.WHITE);
        panel4.setBackground(Color.WHITE);
        panel4.setForeground(Color.WHITE);
        pan4sep1.setBackground(Color.WHITE);
        pan4sep1.setForeground(Color.WHITE);
        pan4sep2.setBackground(Color.WHITE);
        pan4sep2.setForeground(Color.WHITE);
        pan4sep3.setBackground(Color.WHITE);
        pan4sep3.setForeground(Color.WHITE);
        pan4sep4.setBackground(Color.WHITE);
        pan4sep4.setForeground(Color.WHITE);
        pan4sep5.setBackground(Color.WHITE);
        pan4sep5.setForeground(Color.WHITE);
        pan4sep6.setBackground(Color.WHITE);
        pan4sep6.setForeground(Color.WHITE);
        pan4sep7.setBackground(Color.WHITE);
        pan4sep7.setForeground(Color.WHITE);
        pan4sep8.setBackground(Color.WHITE);
        pan4sep8.setForeground(Color.WHITE);
        pan4sep9.setBackground(Color.WHITE);
        pan4sep9.setForeground(Color.WHITE);
        panel5.setBackground(Color.WHITE);
        panel5.setForeground(Color.WHITE);
        pan5sep1.setBackground(Color.WHITE);
        pan5sep1.setForeground(Color.WHITE);
        pan5sep2.setBackground(Color.WHITE);
        pan5sep2.setForeground(Color.WHITE);
        pan5sep3.setBackground(Color.WHITE);
        pan5sep3.setForeground(Color.WHITE);
        pan5sep4.setBackground(Color.WHITE);
        pan5sep4.setForeground(Color.WHITE);
        pan5sep5.setBackground(Color.WHITE);
        pan5sep5.setForeground(Color.WHITE);
        panel6.setBackground(Color.WHITE);
        panel6.setForeground(Color.WHITE);
        pan6sep1.setBackground(Color.WHITE);
        pan6sep1.setForeground(Color.WHITE);
        pan6sep2.setBackground(Color.WHITE);
        pan6sep2.setForeground(Color.WHITE);
        pan6sep3.setBackground(Color.WHITE);
        pan6sep3.setForeground(Color.WHITE);
        pan6sep4.setBackground(Color.WHITE);
        pan6sep4.setForeground(Color.WHITE);
        pan6sep5.setBackground(Color.WHITE);
        pan6sep5.setForeground(Color.WHITE);
        pan6sep6.setBackground(Color.WHITE);
        pan6sep6.setForeground(Color.WHITE);
        pan6sep7.setBackground(Color.WHITE);
        pan6sep7.setForeground(Color.WHITE);
        pan6sep8.setBackground(Color.WHITE);
        pan6sep8.setForeground(Color.WHITE);
        panel7.setBackground(Color.WHITE);
        panel7.setForeground(Color.WHITE);
        panel8.setBackground(Color.WHITE);
        panel8.setForeground(Color.WHITE);

        adultSheegothLabel.setBackground(Color.WHITE);
        adultSheegothLabel.setForeground(Color.BLACK);
        chozoGhostsInX.setBackground(Color.WHITE);
        chozoGhostsInX.setForeground(Color.BLACK);
        chozoRuins.setBackground(Color.WHITE);
        chozoRuins.setForeground(Color.BLACK);
        elitePirateLabel.setBackground(Color.WHITE);
        elitePirateLabel.setForeground(Color.BLACK);
        enemies.setBackground(Color.WHITE);
        enemies.setForeground(Color.BLACK);
        flyingPiratesInX.setBackground(Color.WHITE);
        flyingPiratesInX.setForeground(Color.BLACK);
        icePiratesWithIce.setBackground(Color.WHITE);
        icePiratesWithIce.setForeground(Color.BLACK);
        items.setBackground(Color.WHITE);
        items.setForeground(Color.BLACK);
        magmoorCaverns.setBackground(Color.WHITE);
        magmoorCaverns.setForeground(Color.BLACK);
        majorBosses.setBackground(Color.WHITE);
        majorBosses.setForeground(Color.BLACK);
        mapStations.setBackground(Color.WHITE);
        mapStations.setForeground(Color.BLACK);
        metroidsLabel.setBackground(Color.WHITE);
        metroidsLabel.setForeground(Color.BLACK);
        minorBosses.setBackground(Color.WHITE);
        minorBosses.setForeground(Color.BLACK);
        miscLabel.setBackground(Color.WHITE);
        miscLabel.setForeground(Color.BLACK);
        objects.setBackground(Color.WHITE);
        objects.setForeground(Color.BLACK);
        phazonMines.setBackground(Color.WHITE);
        phazonMines.setForeground(Color.BLACK);
        phendranaDrifts.setBackground(Color.WHITE);
        phendranaDrifts.setForeground(Color.BLACK);
        plasmaPiratesWithFlamethrower.setBackground(Color.WHITE);
        plasmaPiratesWithFlamethrower.setForeground(Color.BLACK);
        powerPiratesWithSupers.setBackground(Color.WHITE);
        powerPiratesWithSupers.setForeground(Color.BLACK);
        rooms.setBackground(Color.WHITE);
        rooms.setForeground(Color.BLACK);
        saveStationCount.setBackground(Color.WHITE);
        saveStationCount.setForeground(Color.BLACK);
        shadowPiratesInX.setBackground(Color.WHITE);
        shadowPiratesInX.setForeground(Color.BLACK);
        spinnersLabel.setBackground(Color.WHITE);
        spinnersLabel.setForeground(Color.BLACK);
        stucturesBrokenWithPowerLabel.setBackground(Color.WHITE);
        stucturesBrokenWithPowerLabel.setForeground(Color.BLACK);
        superMissleStructuresLabel.setBackground(Color.WHITE);
        superMissleStructuresLabel.setForeground(Color.BLACK);
        tallonOverworld.setBackground(Color.WHITE);
        tallonOverworld.setForeground(Color.BLACK);
        wavePiratesWithWavebuster.setBackground(Color.WHITE);
        wavePiratesWithWavebuster.setForeground(Color.BLACK);

        activateTheObservatoryCheckBox.setBackground(Color.WHITE);
        activateTheObservatoryCheckBox.setForeground(Color.BLACK);
        allHallOfTheCheckBox.setBackground(Color.WHITE);
        allHallOfTheCheckBox.setForeground(Color.BLACK);
        allHunterMetroidsFungalCheckBox.setBackground(Color.WHITE);
        allHunterMetroidsFungalCheckBox.setForeground(Color.BLACK);
        antechamberCheckBox.setBackground(Color.WHITE);
        antechamberCheckBox.setForeground(Color.BLACK);
        chapelOfTheEldersCheckBox.setBackground(Color.WHITE);
        chapelOfTheEldersCheckBox.setForeground(Color.BLACK);
        chozoMapStationCheckBox.setBackground(Color.WHITE);
        chozoMapStationCheckBox.setForeground(Color.BLACK);
        chozoMissleStationCheckBox.setBackground(Color.WHITE);
        chozoMissleStationCheckBox.setForeground(Color.BLACK);
        cloakedDroneCheckBox.setBackground(Color.WHITE);
        cloakedDroneCheckBox.setForeground(Color.BLACK);
        flaaghraCheckBox.setBackground(Color.WHITE);
        flaaghraCheckBox.setForeground(Color.BLACK);
        hiveMechaCheckBox.setBackground(Color.WHITE);
        hiveMechaCheckBox.setForeground(Color.BLACK);
        incineratorDroneCheckBox.setBackground(Color.WHITE);
        incineratorDroneCheckBox.setForeground(Color.BLACK);
        largeEnemyWithFlamthrowerCheckBox.setBackground(Color.WHITE);
        largeEnemyWithFlamthrowerCheckBox.setForeground(Color.BLACK);
        metaRidleyCheckBox.setBackground(Color.WHITE);
        metaRidleyCheckBox.setForeground(Color.BLACK);
        minesMapStationCheckBox.setBackground(Color.WHITE);
        minesMapStationCheckBox.setForeground(Color.BLACK);
        minesMissleStationCheckBox.setBackground(Color.WHITE);
        minesMissleStationCheckBox.setForeground(Color.BLACK);
        omegaPirateCheckBox.setBackground(Color.WHITE);
        omegaPirateCheckBox.setForeground(Color.BLACK);
        oneDuplicateOrNothingCheckBox.setBackground(Color.WHITE);
        oneDuplicateOrNothingCheckBox.setForeground(Color.BLACK);
        phendranaMapStationCheckBox.setBackground(Color.WHITE);
        phendranaMapStationCheckBox.setForeground(Color.BLACK);
        plasmaProcessingCheckBox.setBackground(Color.WHITE);
        plasmaProcessingCheckBox.setForeground(Color.BLACK);
        platedBeetleLabel.setBackground(Color.WHITE);
        platedBeetleLabel.setForeground(Color.BLACK);
        thardusCheckBox.setBackground(Color.WHITE);
        thardusCheckBox.setForeground(Color.BLACK);
        
        tallonSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == e.BUTTON1) {
                    count++;
                    tallonSave.setText(""+ count);

                    if(count > 1) {
                        tallonSave.setText("1");
                    }
                }
                if(e.getButton() == e.BUTTON3) {
                    count = 1;
                    count--;
                    tallonSave.setText(""+ count);

                    if(count < 0) {
                        tallonSave.setText("0");
                    }
                }
            }
        });
        chozoSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count1 < 3)
                        count1++;
                        chozoSave.setText("" + count1);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count1 > 0)
                        count1--;
                        chozoSave.setText("" + count1);
                }
            }
        });
        magmoorSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count2 < 2)
                        count2++;
                        magmoorSave.setText("" + count2);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count2 > 0)
                        count2--;
                        magmoorSave.setText("" + count2);
                }
            }
        });
        phendranaSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count3 < 4)
                        count3++;
                    phendranaSave.setText("" + count3);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count3 > 0)
                        count3--;
                    phendranaSave.setText("" + count3);
                }
            }
        });
        minesSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count4 < 3)
                        count4++;
                    minesSave.setText("" + count4);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count4 > 0)
                        count4--;
                    minesSave.setText("" + count4);
                }
            }
        });
        platedBeetle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count16 < 2)
                        count16++;
                    platedBeetle.setText("" + count16);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count16 > 0)
                        count16--;
                    platedBeetle.setText("" + count16);
                }
            }
        });
        adultSheegoth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count17 < 4)
                        count17++;
                    adultSheegoth.setText("" + count17);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count17 > 0)
                        count17--;
                    adultSheegoth.setText("" + count17);
                }
            }
        });
        elitePirates.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count18 < 3)
                        count18++;
                    elitePirates.setText("" + count18);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count18 > 0)
                        count18--;
                    elitePirates.setText("" + count18);
                }
            }
        });
        flyingPirates.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count9 < 9)
                        count9++;
                    flyingPirates.setText("" + count9);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count9 > 0)
                        count9--;
                    flyingPirates.setText("" + count9);
                }
            }
        });
        shadowPirates.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count10 < 6)
                        count10++;
                    shadowPirates.setText("" + count10);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count10 > 0)
                        count10--;
                    shadowPirates.setText("" + count10);
                }
            }
        });
        chozoGhosts.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count11 < 6)
                        count11++;
                    chozoGhosts.setText("" + count11);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count11 > 0)
                        count11--;
                    chozoGhosts.setText("" + count11);
                }
            }
        });
        powerWithSupers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count5 < 3)
                        count5++;
                    powerWithSupers.setText("" + count5);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count5 > 0)
                        count5--;
                    powerWithSupers.setText("" + count5);
                }
            }
        });
        waveWithWavebuster.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count6 < 3)
                        count6++;
                    waveWithWavebuster.setText("" + count6);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count6 > 0)
                        count6--;
                    waveWithWavebuster.setText("" + count6);
                }
            }
        });
        iceWithIcespreader.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count7 < 3)
                        count7++;
                    iceWithIcespreader.setText("" + count7);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count7 > 0)
                        count7--;
                    iceWithIcespreader.setText("" + count7);
                }
            }
        });
        plasmaWithFlamethrower.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count8 < 3)
                        count8++;
                    plasmaWithFlamethrower.setText("" + count8);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count8 > 0)
                        count8--;
                    plasmaWithFlamethrower.setText("" + count8);
                }
            }
        });
        metroids.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count12 < 5)
                        count12++;
                    metroids.setText("" + count12);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count12 > 0)
                        count12--;
                    metroids.setText("" + count12);
                }
            }
        });
        spinners.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count15 < 10)
                        count15++;
                    spinners.setText("" + count15);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count15 > 0)
                        count15--;
                    spinners.setText("" + count15);
                }
            }
        });
        superMissleStructures.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count13 < 5)
                        count13++;
                    superMissleStructures.setText("" + count13);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count13 > 0)
                        count13--;
                    superMissleStructures.setText("" + count13);
                }
            }
        });
        powerbombStructures.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    if (count14 < 3)
                        count14++;
                    powerbombStructures.setText("" + count14);
                }
                if (e.getButton() == e.BUTTON3) {
                    if (count14 > 0)
                        count14--;
                    powerbombStructures.setText("" + count14);
                }
            }
        });
        resetButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == e.BUTTON1) {
                    tallonSave.setText("0");
                    chozoSave.setText("0");
                    magmoorSave.setText("0");
                    phendranaSave.setText("0");
                    minesSave.setText("0");
                    platedBeetle.setText("0");
                    adultSheegoth.setText("0");
                    elitePirates.setText("0");
                    powerWithSupers.setText("0");
                    waveWithWavebuster.setText("0");
                    iceWithIcespreader.setText("0");
                    plasmaWithFlamethrower.setText("0");
                    flyingPirates.setText("0");
                    shadowPirates.setText("0");
                    chozoGhosts.setText("0");
                    metroids.setText("0");
                    superMissleStructures.setText("0");
                    powerbombStructures.setText("0");
                    spinners.setText("0");

                    activateTheObservatoryCheckBox.setSelected(false);
                    allHallOfTheCheckBox.setSelected(false);
                    allHunterMetroidsFungalCheckBox.setSelected(false);
                    antechamberCheckBox.setSelected(false);
                    chapelOfTheEldersCheckBox.setSelected(false);
                    chozoMapStationCheckBox.setSelected(false);
                    chozoMissleStationCheckBox.setSelected(false);
                    cloakedDroneCheckBox.setSelected(false);
                    flaaghraCheckBox.setSelected(false);
                    hiveMechaCheckBox.setSelected(false);
                    incineratorDroneCheckBox.setSelected(false);
                    largeEnemyWithFlamthrowerCheckBox.setSelected(false);
                    metaRidleyCheckBox.setSelected(false);
                    minesMapStationCheckBox.setSelected(false);
                    minesMissleStationCheckBox.setSelected(false);
                    omegaPirateCheckBox.setSelected(false);
                    oneDuplicateOrNothingCheckBox.setSelected(false);
                    phendranaMapStationCheckBox.setSelected(false);
                    plasmaProcessingCheckBox.setSelected(false);
                    thardusCheckBox.setSelected(false);

                    count   = 0;
                    count1  = 0;
                    count2  = 0;
                    count3  = 0;
                    count4  = 0;
                    count5  = 0;
                    count6  = 0;
                    count7  = 0;
                    count8  = 0;
                    count9  = 0;
                    count10 = 0;
                    count11 = 0;
                    count12 = 0;
                    count13 = 0;
                    count14 = 0;
                    count15 = 0;
                    count16 = 0;
                    count17 = 0;
                    count18 = 0;
                }
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("bingoTrackerGUI");
        frame.setContentPane(new bingoTrackerGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("Metroid Prime Bingo Tracker");
        frame.setVisible(true);
    }
}
